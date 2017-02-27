package fun;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 树
 *
 * @author liuzh
 * @since 2016-11-08 22:51
 */
public class TreeUtil {

    /**
     * 节点
     */
    public static class Node {
        private Integer id;
        private String name;
        private Integer parentId;
        private List<Node> children;

        public Node() {
        }

        public Node(Integer id, String name, Integer parentId) {
            this.id = id;
            this.name = name;
            this.parentId = parentId;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getParentId() {
            return parentId;
        }

        public void setParentId(Integer parentId) {
            this.parentId = parentId;
        }

        public List<Node> getChildren() {
            return children;
        }

        public void setChildren(List<Node> children) {
            this.children = children;
        }

        public void addChild(Node child){
            if(this.children == null){
                this.children = new ArrayList<>();
            }
            this.children.add(child);
        }
    }

    /**
     * 转换树
     *
     * @param list
     * @return
     */
    public static List<Node> tree(List<Node> list){
        Map<Integer, Node> idMap = new HashMap<>();
        for (Node node : list) {
            idMap.put(node.getId(), node);
        }
        List<Node> result = new ArrayList<>();
        for (Node node : list) {
            if(node.getParentId() != null && idMap.containsKey(node.getParentId())){
                idMap.get(node.getParentId()).addChild(node);
            } else {
                result.add(node);
            }
        }
        return result;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        List<Node> list = new ArrayList<>();
        list.add(new Node(1, "1", null));
        list.add(new Node(11, "11", 1));
        list.add(new Node(12, "12", 1));
        list.add(new Node(111, "111", 11));
        list.add(new Node(121, "121", 12));
        list.add(new Node(122, "122", 12));
        list.add(new Node(123, "123", 12));
        list.add(new Node(1211, "1211", 121));
        list.add(new Node(1222, "1222", 122));
        list.add(new Node(1223, "1223", 122));

        List<Node> result = tree(list);
        printTree(result, null);
    }

    public static final String  PREFIX_BRANCH = "├─";//树枝
    public static final String  PREFIX_TRUNK  = "│ ";//树干
    public static final String  PREFIX_LEAF   = "└─";//叶子
    public static final String  PREFIX_EMP    = "  ";//空

    /**
     * 输出树形
     *
     * @param nodes
     * @param prefix
     */
    public static void printTree(List<Node> nodes, String prefix){
        if(prefix == null){
            prefix = "";
        } else {
            prefix = prefix.replace(PREFIX_BRANCH, PREFIX_TRUNK);
            prefix = prefix.replace(PREFIX_LEAF, PREFIX_EMP);
        }
        for(int i = 0; i < nodes.size(); i++){
            //最后一个是叶子
            if(i == nodes.size() - 1){
                System.out.println(prefix + PREFIX_LEAF + nodes.get(i).getName());
                if(nodes.get(i).getChildren() != null){
                    printTree(nodes.get(i).getChildren(), prefix + PREFIX_LEAF);
                }
            }
            //树枝
            else {
                System.out.println(prefix + PREFIX_BRANCH + nodes.get(i).getName());
                if(nodes.get(i).getChildren() != null){
                    printTree(nodes.get(i).getChildren(), prefix + PREFIX_TRUNK);
                }
            }
        }
    }

}
