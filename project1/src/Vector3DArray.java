public class Vector3DArray {

    private Vector3D[] arr;


    public Vector3DArray(int n) {
        arr = new Vector3D[n];
    }


    public int Vector3DArrLength() {
        return arr.length;
    }

    public void Vector3DArrTrans(int i, Vector3D vector) {
        arr[i] = vector;
    }

    //наибольшая длина вектора в массиве,
    public double Vector3DArrMaxLength() {
        double maxleng=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].VectorLength() > maxleng) {
                maxleng = arr[i].VectorLength();
            }
        }
        return maxleng;
    }

    // поиск заданного вектора в массиве (результат – индекс первого вхождения или –1, если не найден)
    public int Vector3DArrFind(Vector3D vector) {
        int n = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(vector)) {
                return i;
            }
        }
        return n;
    }

    //сумма всех векторов в массиве
    public Vector3D Vector3DArrSumAll() {
        Vector3D vector = new Vector3D();
        int x = 0, y = 0 ,z = 0;
        for (int i = 0; i < arr.length; i++) {
            x+= arr[i].GetX();
            y+= arr[i].GetY();
            z+= arr[i].GetZ();
        }
        vector.SetX(x);
        vector.SetY(y);
        vector.SetZ(z);
        return vector;
    }

    public Vector3D Vector3DArr7(double[] array) {
        if(arr.length != array.length)
        {
            throw new IllegalArgumentException();
        }
        Vector3D vector = new Vector3D();
        for (int i = 0; i < arr.length && i < array.length; i++) {
            vector.SetX((int) (vector.GetX() + (array[i] * arr[i].GetX())));
            vector.SetY((int) (vector.GetY() + (array[i] * arr[i].GetY())));
            vector.SetZ((int) (vector.GetZ() + (array[i] * arr[i].GetZ())));
        }
        System.out.println(vector.VectorLength());
        System.out.println("Линейная комбинация " +vector.GetX() + " " + vector.GetY() + " " + vector.GetZ());
        return vector;
    }

    public Point3D[] Vector3DArr8(Point3D point) {
        Point3D[] arrpoint = new Point3D[arr.length];
        for (int i = 0; i < arrpoint.length; i++) {
            arrpoint[i] = new Point3D();
            arrpoint[i].SetX(point.GetX() + arr[i].GetX());
            arrpoint[i].SetY(point.GetY() + arr[i].GetY());
            arrpoint[i].SetZ(point.GetZ() + arr[i].GetZ());
        }
        for (int i = 0; i < arrpoint.length; i++) {
            System.out.println(arrpoint[i].GetX() + " " + arrpoint[i].GetY() + " " + arrpoint[i].GetZ());
        }
        return arrpoint;
    }


}
