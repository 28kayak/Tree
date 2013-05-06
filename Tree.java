
public class Tree
{
	protected TreeNode root = null;
	
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

}
