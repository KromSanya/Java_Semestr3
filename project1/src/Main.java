import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double leng;

        double arr[] = new double[3];
        arr[0] = 5;
        arr[1] = 3;
        arr[2] = 0;

 /*
        Point3D point2 = new Point3D(5, 10, 3);
        if(point1.GetX() == point2.GetX() &&
                point1.GetY() == point2.GetY() &&
                point1.GetZ() == point2.GetZ())
        {
            System.out.println("Две точки равны");
        }else
        {
            System.out.println("Две точки не равны");
        }

        if(point1.equals(point2)) {
            System.out.println("point1 equals point2");
        }
        if(point1 == point2) {
            System.out.println("point1 == point2");
        }*/


        Point3D point1 = new Point3D(5, 10, 3);
        Point3D point2 = new Point3D(5, 10, 3);
        Point3D point3 = new Point3D(10, 10, 10);

   /*
        System.out.println(point1.equals(point1));
        System.out.println(point1.equals(point2));
        System.out.println(point1.equals(point3));
        */


        Vector3D vector1 = new Vector3D(5, 10, 3);
        Vector3D vector2 = new Vector3D(5, 10, 3);
        Vector3D vector3 = new Vector3D(2, 7, 0);
        Vector3D vector5 = new Vector3D(10, 7, 0);

        Vector3D vector4 = new Vector3D();

       // System.out.println(vector1.VectorLength());

       //System.out.println(vector1.equals(vector2));

        Vector3DProcessor vect = new Vector3DProcessor();

        vector4 = vect.VectorSum(vector1, vector2);
        System.out.println(vector4.GetX() +" "+ vector4.GetY() +" "+ vector4.GetZ());

        System.out.println(vect.VectorScalar(vector1, vector2));

        vector4= vect.VectorVect(vector1, vector2);
        System.out.println(vector4.GetX() +" "+ vector4.GetY() +" "+ vector4.GetZ());

        System.out.println(vect.VectorCollinearity(vector1, vector2));


        Vector3DArray vectarr = new Vector3DArray(3);
        vectarr.Vector3DArrTrans(0, vector1);
        vectarr.Vector3DArrTrans(2, vector2);
        vectarr.Vector3DArrTrans(1, vector3);

       System.out.println( vectarr.Vector3DArrLength());

        System.out.println(vectarr.Vector3DArrMaxLength());

        System.out.println(vectarr.Vector3DArrFind(vector2));
        System.out.println(vectarr.Vector3DArrFind(vector5));

        vector4 = vectarr.Vector3DArrSumAll();
        System.out.println("Сумма всех векторов " + vector4.GetX() +" "+ vector4.GetY() +" "+ vector4.GetZ());

      vectarr.Vector3DArr7(arr);

      vectarr.Vector3DArr8(point1);








    }
}







