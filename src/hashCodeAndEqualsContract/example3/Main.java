package hashCodeAndEqualsContract.example3;

import java.util.*;
    class People{
        private String name;
        private int age;
        public People(){
        }
        public People(String name, int age){
            this.name = name;
            this.age = age;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return this.name;
        }
        public void setAge(int age){
            this.age=age;
        }
        public int getAge(){
            return this.age;
        }
        @Override
        public boolean equals(Object o){
            if(this==o){
                return true;
            }
            if(o==null || this.getClass() != o.getClass()){
                return false;
            }
            People p = (People) o;
            return this.name.equals(p.name) && this.age==p.age;
        }
        @Override
        public int hashCode(){
            return Objects.hash(name);
        }
    }
    public class Main
    {
        public static void main(String[] args) {
            System.out.println("Hello World");
            People p1 = new People("Amit",25);
            People p2 = new People("Ankit",29);
            People p3 = new People("Hari",23);
            People p4 = new People("Ankit",29);
            People p5 = new People("Ankit",30);
            Map<People,String> map = new HashMap<>();
            map.put(p1,"y");
            map.put(p2,"y");
            map.put(p3,"y");
            map.put(p4,"y");
            map.put(p5,"y");
            System.out.println("size of map1 is : "+ map.size());
            Map<String,Integer> map2 = new HashMap<>();
            map2.put("Amit",1);
            map2.put("Amit",1);
            map2.put("Ankit",2);
            map2.put("vibhu",3);
            map2.put("rupesh",4);
            map2.put("Amit",5);
            System.out.println("size of map2 is: "+map2.size());
        }
    }

