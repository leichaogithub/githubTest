package testBiji;

public class bi_ji {
	public static void main(String[] args) {
		//objecttest();
		/*
			����
		   toString����
		    ������ת��Ϊ�ַ��������ǵõ����Ƕ�����ڴ��ַ
		 * */
		int a []= {1,2,3,4,5,6};
		System.out.println(a.toString());
	}

	public static void objecttest() {
		// object�෽������
		/*
		 * equals������==������ 
		 * 1).equals�����ַ�����˵�ǱȽϴ����ݵģ����ڷ��ַ�����˵�ǱȽ�ָ��Ķ����Ƿ���ͬ��
		 * 2).==���ǱȽ�ָ��Ķ����Ƿ���ͬ��Ҳ���Ƕ������ڴ��е��׵�ַ
		 *   ע�⣺�����������Ͳ��ܹ���equals���Ƚϣ����ǻ������͵ķ�װ����ԡ�
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
		//��д�����equals������ʵ���Լ��ıȽϷ�ʽ
		public boolean equals(Object obj) {
			//�жϵ�ǰ����equals�����Ķ���ʹ��ݽ����Ķ����Ƿ���ͬһ��
			if(this == obj){
				return true;
			}
			//�жϴ��ݽ����Ķ����Ƿ���Person����
			//instanceof �����������������ʱָ�������Ƿ����ض����һ��ʵ����
			//instanceofͨ������һ������ֵ��ָ������������Ƿ�������ض�����������������һ��ʵ����
			if(!(obj instanceof Person)){
				return false;
			}
			//��obj����ת��ΪPerosn���ã�����������
			//����ת�ͣ�����ת�ͳɸ���������ת�ͣ�������˵������ת�ͳ������������ת�͡�
			//            ���ǣ�����ת�Ϳ��ܻ����һЩ���⣺���ǿ���˵��ȸ���񣬵�����˵�������ȸ��
			Person p = (Person)obj;
			return this.age == p.age;
		}
	}

}
