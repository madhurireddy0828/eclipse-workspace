package java8.Features.Theards;
/*Req:
a person obj has a count with inital value as 5.
share the same person obj to 10 different threads.
every Thread has to add +5 to the count for the person obj at the same time.

ex:
count initial value is 5
count final value ==========> 55*/

		class Person {
		int count;
		public Person(int count) {
		super();
		this.count = count;
		}
		}



