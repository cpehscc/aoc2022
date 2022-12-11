import java.util.ArrayList;
import java.util.List;

public class MyTreeNode{
  private String name; 
  private String type;
  private List<MyTreeNode> children;
  private MyTreeNode parent;
  private int size;

  public MyTreeNode(String name, String type) {
    this.name = name;
    this.type = type;
    this.size = 0;
    this.children = new ArrayList<>();
    this.parent = null;
  }

   public MyTreeNode(String name, String type, int size) {
    this.name = name;
    this.type = type;
    this.size = size;
    this.children = new ArrayList<>();
    this.parent = null;
  }

  public void addChild(MyTreeNode child) {
    child.setParent(this);
    this.children.add(child);
    this.addSize(child.getSize());
  }

  public void addChild(String name, String type) {
    MyTreeNode newChild = new MyTreeNode(name, type);
    this.addChild(newChild);
  }

  public void addChild(String name, String type, int size) {
    MyTreeNode newChild = new MyTreeNode(name, type, size);
    this.addChild(newChild);
  }

  public List<MyTreeNode> getChildren() {
    return children;
  }

  public boolean hasChildren() {
    return (!children.isEmpty()); 
  }

  public MyTreeNode getChild(String name) {
    MyTreeNode child = null;
    for (MyTreeNode t: children) {
      if (t.getName().equals(name))
        child = t;
    }
    return child;
  }

  public String getName() {
    return name;
  }
  
  public String getType() {
    return type;
  }

  private void setParent(MyTreeNode parent) {
    this.parent = parent;
  }

  public MyTreeNode getParent() {
    return parent;
  }

  public int getSize() {
    return size;
  }

  public void addSize(int size) {
    this.size += size;
    if (parent != null) 
      this.parent.addSize(size);
  }

  public String toString() {
    String ans = "name: " + name + " type: " + type + " size: " + size;
    if (parent != null)
      ans += " parent: " + parent.getName();
    return ans;
  }
}