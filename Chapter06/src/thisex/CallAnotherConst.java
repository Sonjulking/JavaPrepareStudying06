package thisex;

class Person {
	String name;
	int age;

	public Person() {  //����Ʈ ������
		//this ���� ��� ������Ʈ��Ʈ�� ���� �ȵȴ�. 
		//����Ʈ �����ڿ��� �𽺸� ����Ѵٴ� ���� 
		//�ν��Ͻ��� �ȸ�������� ����Ѵٰ� �����ϱ� ������
		//������Ʈ��Ʈ�� ������ �ȵȴ�.
		this("�̸�����",1); //����Ʈ �����ڿ���  �ٸ� ������ ȣ��
	}
	
	public Person(String name, int age) { //������
 		this.name = name;
		this.age = age;
	}
	
	public Person returnSelf() {
		return this;
	}
}

public class CallAnotherConst {

	public static void main(String[] args) {

		Person p1 = new Person();
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p1.returnSelf());
		
		
	}

}
