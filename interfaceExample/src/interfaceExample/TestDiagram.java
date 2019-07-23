package interfaceExample;

public class TestDiagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chicken hen = new Chicken(2,"hen",6,8,false);
		Dog Boxer = new Dog(35,"Boxer",5,4,false);
		
		Animal mypts=new Animal(20,"Boxer",5,4,false);
	}
			
			@Override
			public String communicate() {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		Human h1 = new Human(4,"Moh",9,10,false,);
		House ho1=new House(9000);
		House ho2 = new House(8000);
		House ho3=new House(h1, Ematerial.Brick, 8888888);
		Human h2 = new Human(20, Boxer, 900000,ho1);
		Human h3 = new Human(5, Boxer, 696969, ho3);
		System.out.println(h2);
		System.out.println(ho2.compareTo(ho1));
		

	}

}
