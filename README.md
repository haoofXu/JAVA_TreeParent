# JAVA_TreeParent
JAVA，树的父节点表示法。树中除根节点之外每个节点都有一个父节点，为了记录树中节点与节点之间的父子关系，可以为每个节点增加一个parent域，用以记录该节点的父节点。  
void addNode(E data, Node parent) 为指定节点添加子节点；  
boolean empty() 判断树是否为空；  
Node<E> root()  返回根节点；  
Node<E> parent(Node node) 返回指定节点（非根节点）的父节点；  
List<Node<E>> children (Node parent)  返回指定节点（非叶子节点）的所有子节点；  
deep()  返回该树的深度；  
pos(Node node)  返回节点的位置。
