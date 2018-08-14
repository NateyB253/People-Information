import java.nio.InvalidMarkException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.io.Paths;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("How would you like to sort this: ");
		int input = kb.nextInt();
		
		Person[] people = new Person[25];
		//people[0] = new Person("Dustin","Cobb", 61,"Pepkor Park", "Zuhhotseb", "NM", "37990");
		
		
		//Person[] people1 = people.clone();
	//	selectionSort(people1);
	//	bubbleSort(people);
		
		switch (input)
		{
		case 1:
			bubbleSort(people);
			break;
		
		case 2:
			selectionSort(people);
			break;
		
		case 3:
			insertionSort(people);
			break;
			
		default:
			System.out.println("Sorry invalid choice");
			
		}
		for(int i = 0; i < people.length; i++)
		{
			
			Person p = people[i];
			//if (p.Age == input)
				//{
					System.out.println(p.FName + ' ' + p.LName + ' ' + p.Age + ' ' + p.Address + ' ' + p.City + ' ' + p.State + ' ' + p.Zip);
				//}
		}
		
		
	}
		private static void bubbleSort(Person[] people)
		{
			
			int n = people.length;
			Person temp = null;

			for (int i = 0; i < n; i++)
			{
				for (int j = 1; j < n - i; j++)
				{
					if (people[j-1].Age > people[j].Age)
					{
						temp = people[j-1];
						people[j - 1] = people[j];
						people[j] = temp;
					}
				}
			}


		}
		
		private static void selectionSort(Person[] people)
		{
			Person temp = null;
			
			for (int i = 0; i < people.length - 1; i++)
			{
				int minIndex = i;
				for (int j = i + 1; j < people.length; j++)
				{
					if (people[j].FName.compareTo(people[minIndex].FName) < 0)
					{
						minIndex = j;
					}
					
				}
				temp = people[minIndex];
				people[minIndex] = people[i];
				people[i] = temp;
				
			}
		}
		
		private static void insertionSort(Person[] people)
		{
			for(int i = 1; i < people.length; i++)
			{
				Person key = people[i];
				int j = i - 1;
				
				while(j >= 0 && key.State.compareTo(people[j].State) < 0)
				{
					people[j+1] = people[j];
					j--;
				}
			people[j+1] = key;
			}
		}
		
		void readAllLines() throws IOException
		{
			List<Person[]> people;
			Files.readAllLines(Paths.get("People.csv"));
			for(Person[] : people)
			{
				
			}
		}
}