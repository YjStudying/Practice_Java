package FengZhuang;

public class EncapDemo {
    public static void main(String[] args) {
        EncapTest encap = new EncapTest();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("1231ms");

        System.out.println("Name:" + encap.getName() + "  Age:" +encap.getAge());
    }
}
