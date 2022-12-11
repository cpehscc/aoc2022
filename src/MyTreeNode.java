import java.util.ArrayList;
import java.util.List;

public class MyTreeNode<T>{
    private T data;
    private List<MyTreeNode> children;
    private MyTreeNode parent;

    public MyTreeNode(T data) {
      this.data = data;
      this.children = new ArrayList<>();
      this.parent = null;
    }

    public void addChild(MyTreeNode child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        MyTreeNode<T> newChild = new MyTreeNode<>(data);
        this.addChild(newChild);
    }

    public void addChildren(List<MyTreeNode> children) {
        for(MyTreeNode t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<MyTreeNode> getChildren() {
        return children;
    }

  public MyTreeNode getChild(T data) {
    MyTreeNode<T> child = null;
    for (MyTreeNode t: children) {
      if (t.getData().equals(data))
        child = t;
    }
    return child;
  }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(MyTreeNode parent) {
        this.parent = parent;
    }

    public MyTreeNode getParent() {
        return parent;
    }
}