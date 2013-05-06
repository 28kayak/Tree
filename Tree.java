
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
	}//contains
	public void insert(int target)
	{
		if(this.root == null)
		{
			this.root = new TreeNode(target);
			return;//same as nothing to retrun
		}
		TreeNode node = this.root;
		while(true)
		{
			if(target <= node.value)
			{//target is on the left side of the tree since target is less than value of node
				if(node.left != null)
				{//if node left is not null, indicates there are already some children
				//Look for null space which is located on the left side of grand-children 
					node = node.left;
				}
				else
				{//if node.left == null indicates there is a space to set a child node.
				//so put left side of the node a new node.
					node.left =new TreeNode(target);
					return ;
				}
			}
			else
			{//(terget >= node.value)
				//target is on the right side of the tree since target is Greater than 
				//value of node
				if(node.right != null)
				{
					node = node.right;
				}
				else
				{
					node = new TreeNode(target);
					return;
				}
			}
		}
	}
	


}
