package day5.ex;

public class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) {
        if (this == o){
            return 0;
        }
        if (o instanceof CompareObject){
            ComparableCircle c = (ComparableCircle) o;
//            return (int) (this.getRadius() - c.getRadius());
            // 错误的

            // 方式一
//            if (this.getRadius() > c.getRadius()){
//                return 1;
//            }else if (this.getRadius() < c.getRadius()){
//                return -1;
//            }else{
//                return 0;
//            }

            //方式二
            // 声明为包装类，可调用宝航类的方法

            return this.getRadius().compareTo(c.getRadius());
        }else{
            return 0;
//            throw new RuntimeException("传入的对象异常");
        }
    }
}
