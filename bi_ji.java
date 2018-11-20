package testBiji;

public class bi_ji {
	public static void main(String[] args) {
		//objecttest();
		/*
			测试
		   toString方法
		    将对象转换为字符串，但是得到的是对象的内存地址
		 * */
		int a []= {1,2,3,4,5,6};
		System.out.println(a.toString());
	}

	public static void objecttest() {
		// object类方法测试
		/*
		 * equals方法与==的区别 
		 * 1).equals对于字符串来说是比较大内容的，对于非字符串来说是比较指向的对象是否相同的
		 * 2).==号是比较指向的对象是否相同的也就是对象在内存中的首地址
		 *   注意：基本数据类型不能够用equals来比较，但是基本类型的封装类可以。
		 */
		Integer a=2;
		int b=2;
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		System.out.println(str1.equals(str2));
		System.out.println(a.equals(b));
		
	}
	class Person extends Object{
		int age ;
		//复写父类的equals方法，实现自己的比较方式
		public boolean equals(Object obj) {
			//判断当前调用equals方法的对象和传递进来的对象是否是同一个
			if(this == obj){
				return true;
			}
			//判断传递进来的对象是否是Person类型
			//instanceof 运算符是用来在运行时指出对象是否是特定类的一个实例。
			//instanceof通过返回一个布尔值来指出，这个对象是否是这个特定类或者是它的子类的一个实例。
			if(!(obj instanceof Person)){
				return false;
			}
			//将obj向下转型为Perosn引用，访问其属性
			//上下转型：子类转型成父类是向上转型，反过来说，父类转型成子类就是向下转型。
			//            但是，向下转型可能会带来一些问题：我们可以说麻雀是鸟，但不能说鸟就是麻雀。
			Person p = (Person)obj;
			return this.age == p.age;
		}
	}

}
