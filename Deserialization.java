import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Employee implements Serializable
{
	public String Name;
	public String Salary;
}

public class Deserialization 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Employee emp = new Employee();
		try
		{
			FileInputStream fin = new FileInputStream("J:\\SerialExample.txt");
			ObjectInputStream in = new ObjectInputStream(fin);
			emp = (Employee)in.readObject();
			System.out.println(emp.Name+" "+emp.Salary);
			in.close();
			fin.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
