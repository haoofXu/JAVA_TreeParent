package TreeParent;

import java.util.List;

public class treeParentTest {
	public static void main(String[] args) {

        TreeParent<String> tp = new TreeParent<String>("��");
        TreeParent.Node root = tp.root();
        System.out.println(root);
        tp.addNode("�ڵ�1", root);
        System.out.println("��������ȣ�" + tp.deep());
        tp.addNode("�ڵ�2", root);
        // ��ȡ���ڵ�������ӽڵ�
        List<TreeParent.Node<String>> nodes = tp.children(root);
        System.out.println("���ڵ�ĵ�һ���ӽڵ㣺" + nodes.get(0));
        // Ϊ���ڵ�ĵ�һ���ӽڵ�����һ���ӽڵ�
        tp.addNode("�ڵ�3", nodes.get(0));
        System.out.println("��������ȣ�" + tp.deep());

    }
}
