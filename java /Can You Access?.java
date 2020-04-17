o = new Inner().new Private();
System.out.println(num+" is "+((Solution.Inner.Private)o).powerof2(num)); //BEST 

or 

o = new Inner().new Private();
System.out.println(num+" is "+new Inner().new Private().powerof2(num));

or 

System.out.println(num+" is "+((Inner.Private)(o = new Inner().new Private())).powerof2(num)); // BEST? 