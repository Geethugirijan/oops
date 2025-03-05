import java.util.*;
public class Matrix
{
	int row;
	int col;
	int [][] array;
	public Matrix()
	{
		array=new int[10][10];
	}
	public void getMatrix()
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter no.of rows:");
		this.row=sc.nextInt();
		System.out.print("enter no.of columns:");
		this.col=sc.nextInt();
		System.out.println("enter the matrix elements:");
		for(int rc=0;rc<this.row;rc++)
		{
			for(int cc=0;cc<this.col;cc++)
			{
				this.array[rc][cc]=sc.nextInt();
			}
		}
	}
	public static Matrix sum(Matrix c1,Matrix c2)
	{
		if(c1.row!=c2.row||c1.col!=c2.col)
		{
			System.out.println("Matrix addition is not possible");
			return null;
			
		}
		Matrix temp=new Matrix();
		temp.row=c1.row;
		temp.col=c1.col;
		for(int rc=0;rc<c1.row;rc++)
		{
			for(int cc=0;cc<c1.col;cc++)
			{
				temp.array[rc][cc]=c1.array[rc][cc]+c2.array[rc][cc];
			}
		}
		return temp;
	}
	public void displayMatrix()
	{
		for(int rc=0;rc<this.row;rc++)
		{
			for(int cc=0;cc<this.col;cc++)
			{
				System.out.print(this.array[rc][cc]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Matrix first=new Matrix();
		Matrix second=new Matrix();
		first.getMatrix();
		second.getMatrix();
		Matrix result=sum(first,second);
		if(result!=null)
		{
			System.out.println("sum matrix:");
			result.displayMatrix();
			System.out.println("end");
		}
	} 
}

