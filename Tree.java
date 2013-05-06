
public class Tree	
{
	protected TreeNode root;
	
	public Tree(int element)
	{
		root.left = null;
		root.right = null;
		root.value = element;
	}
	
	protected void replace(TreeNode parent, TreeNode newNode, TreeNode oldNode)
	{
		if(parent == null)
		{
			this.root = newNode;
			return;
		}
		if(parent.left == oldNode)
		{
			parent.left = newNode;
		}
		else if(parent.right == oldNode)
		{
			parent.right = newNode;
		}
		else
		{
			throw new RuntimeException("No children!!!");
			//this Exception is thrown when parent is NOT null
			//and parent does not have any child.
		}
	}
	public boolean contains(int target)
	{
		return  contains(root, target);
	}
	public boolean contains(TreeNode node, int targetElement)
	{
		if(node == null)
		{
			return false;
		}
		if(node.value == targetElement)
		{
			return true;
		}
		if(targetElement < node.value)
		{
			return contains(node.left, targetElement);
		}
		else
		{
			return contains(node.right, targetElement);
		}
	}
	
	/*
	public String toString()
	{
		TreeNode cursor;
		if(this.root != null)
		{
			cursor = root.left();
		}
	}
	*/

}
