import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter the age: ");
		//int input = kb.nextInt();
		
		Person[] people = new Person[25];
		people[0] = new Person("Dustin","Cobb", 61,"Pepkor Park", "Zuhhotseb", "NM", "37990");
		people[1] = new Person("Allen", "Greer",20,"Rinem Plaza", "Ozenanep", "TN", "98973");
		people[2] = new Person("Lucile","West",33,"Pavo Trail","Sucdennec","MN","24853");
		people[3] = new Person("Carolyn","Rivera",58,"Hizcah Point","Rarhucta","SC","96055");
		people[4] = new Person("Ruby","Walsh",21,"Jeve Glen","Hicauze","IN","99661");
		people[5] = new Person("Ricky","Bridges",54,"Hafic Point","Begebvi","WV","83957");
		people[6] = new Person("Lula","Webb",21,"Uwose Drive","Seicuip","ID","77608");
		people[7] = new Person("Don","Franklin",46,"Rigaw Mill","Nebirrun","UT","24467");
		people[8] = new Person("Clayton","Sims",27,"Habso Pike","Jawazgib","WY","54649");
		people[9] = new Person("Kenneth","Vargas",58,"Diig Terrace","Fazraza","WA","99463");
		people[10] = new Person("Sally","Watson",20,"Micat Glen","Alolizzo","CO","87846");
		people[11] = new Person("Aiden","Strickland",42,"Mesa Center","Numillub","NY","39096");
		people[12] = new Person("Ida","Simmons",42,"Ofti Grove","Funpokru","WA","26564");
		people[13] = new Person("Florence","Wood",21,"Vapnu Square","Omojobo","NJ","11501");
		people[14] = new Person("Catherine","Crawford",54,"Nedub Parkway","Pagusnal","IL","94825");
		people[15] = new Person("Hulda","Wells",63,"Lolfi Road","Awtove","NJ","49980");
		people[16] = new Person("Lewis","Wade",56,"Padreg Mill","Parzacul","FL","02855");
		people[17] = new Person("Abbie","Stephens",23,"Wiru Mill","Vokalato","SC","28569");
		people[18] = new Person("Tommy","Watts",18,"Wovpon Extension","Gedarguc","MD","01979");
		people[19] = new Person("Jack","Brown",64,"Cetbaj Pike","Pujjapes","WI","19207");
		people[20] = new Person("Nicholas","Henry",61,"Hacede Ridge","Sonudac","FL","59054");
		people[21] = new Person("Claudia","Allison",33,"Gesri Trail","Mubhidmo","UT","29629");
		people[22] = new Person("Theresa","Harrison",49,"Ibihig Turnpike","Welopzi","CA","59460"); 
		people[23] = new Person("Blake","Roberson",64,"Docuk Point","Bifira","SC","90570");
		people[24] = new Person("Theodore","Gardner",20,"Jada Key","Bejimu","ID","29394");
		
		Person[] people1 = people.clone();
		selectionSort(people1);
		bubbleSort(people);
		
		/*for(int i = 0; i < people.length; i++)
		{
			
			Person p = people[i];
			//if (p.Age == input)
				//{
					System.out.println(p.FName + ' ' + p.LName + ' ' + p.Age + ' ' + p.Address + ' ' + p.City + ' ' + p.State + ' ' + p.Zip);
				//}
		}*/
		
		for(int i = 0; i < people.length; i++)
		{
			
			Person p = people1[i];
		
					System.out.println(p.FName + ' ' + p.LName + ' ' + p.Age + ' ' + p.Address + ' ' + p.City + ' ' + p.State + ' ' + p.Zip);
				
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
		
		private static void selectionSort(Person[] people1)
		{
			Person temp = null;
			
			for (int i = 0; i < people1.length; i++)
			{
				
				for (int j = 0; j < people1.length - 1; j++)
				{
					if (people1[j].FName.compareTo(people1[i].FName) < 0);
					{
						temp = people1[j];
						people1[j] = people1[i];
						people1[j] = temp;
					}
					
				}
				
				
			}
		}
}
