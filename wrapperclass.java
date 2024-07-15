public class example9 {
        public static void main(String[] args) {
            Integer a=new Integer(3);
            int i=a.intValue();
            int j=a;

            Byte a1=new Byte((byte)3);
            byte i1=a1.byteValue();
            byte j1=a1;


            Long a2=new Long(3);
            long i2=a2.longValue();
            long j2=a2;


            Short a3=Short.valueOf((short)3);
            short i3=a3.shortValue();
            short j3=a3;


            Float a4=Float.valueOf((float)3);
            float i4=a4.floatValue();
            float j4=a4;


            Double a5=Double.valueOf((double)3);
            double i5=a5.doubleValue();
            double j5=a5;

            Character a6=Character.valueOf((char)'a');
            char i6=a6.charValue();
            char j6=a6;

            Boolean a7=Boolean.valueOf(true);
            boolean i7=a7.booleanValue();
            boolean j7=a7;
            System.out.println("Integer"+" "+a+" "+i+" "+j);
            System.out.println("Byte"+" "+a1+" "+i1+" "+j1);
            System.out.println("Long"+" "+a2+" "+i2+" "+j2);
            System.out.println("Short"+" "+a3+" "+i3+" "+j3);
            System.out.println("Float"+" "+a4+" "+i4+" "+j4);
            System.out.println("Double"+" "+a5+" "+i5+" "+j5);
            System.out.println("Character"+" "+a6+" "+i6+" "+j6);
            System.out.println("Boolean"+" "+a7+" "+i7+" "+j7);
        }
    }
