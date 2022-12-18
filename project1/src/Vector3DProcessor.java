public class Vector3DProcessor {


    //Сумма двух векторов
    public Vector3D VectorSum(Vector3D vector1, Vector3D vector2) {
        int x, y, z;
        x = vector1.GetX() + vector2.GetX();
        y = vector1.GetY() + vector2.GetY();
        z = vector1.GetZ() + vector2.GetZ();
        Vector3D vector3 = new Vector3D(x, y, z);


        return vector3;
    }

    //Разность двух векторов
    public Vector3D VectorDif(Vector3D vector1, Vector3D vector2) {
        int x, y, z;
        x = vector1.GetX() - vector2.GetX();
        y = vector1.GetY() - vector2.GetY();
        z = vector1.GetZ() - vector2.GetZ();
        Vector3D vector3 = new Vector3D(x, y, z);


        return vector3;
    }

    //Скалярное произведение двух векторов
    public int VectorScalar(Vector3D vector1, Vector3D vector2) {
        int mult = (vector1.GetX() * vector2.GetX()) + (vector1.GetY() * vector2.GetY()) + (vector1.GetZ() * vector2.GetZ());
        return mult;
    }

    //Векторное произведение двух векторов
    public Vector3D VectorVect(Vector3D vector1, Vector3D vector2) {
        int x, y, z;

        x = (vector1.GetY() * vector2.GetZ()) - (vector1.GetZ() * vector2.GetY());
        y = (vector1.GetZ() * vector2.GetX()) - (vector1.GetX() * vector2.GetZ());
        z = (vector1.GetX() * vector2.GetY()) - (vector1.GetY() * vector2.GetX());
        Vector3D vector3 = new Vector3D(x, y, z);
        return vector3;
    }

    //Проверка коллинеарности двух векторов
    public boolean VectorCollinearity(Vector3D vector1, Vector3D vector2) {
        Vector3D vector3 = VectorVect(vector1, vector2);
        if (vector3.GetX() == 0 && vector3.GetY() == 0 && vector3.GetZ() == 0) {
            System.out.println("Эти два вектора коллинеарны");
            return true;
        }
        System.out.println(vector3.GetX() + " " + vector3.GetY() + " " + vector3.GetZ());
        return false;
    }
}
