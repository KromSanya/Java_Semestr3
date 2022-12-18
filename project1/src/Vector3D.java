import java.util.Objects;

public class Vector3D {
    private int x, y, z;

    public Vector3D() {
        x = 0;
        y = 0;
        z = 0;
    }

    public Vector3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D(Point3D point1, Point3D point2) {
        x = point1.GetX() - point2.GetX();
        y = point1.GetY() - point2.GetY();
        z = point1.GetZ() - point2.GetZ();
    }

    public double VectorLength() {
        double length = Math.sqrt(Math.abs(x * x + y * y + z * z));
        return length;
    }
/*
    public void VectorEquals(Vector3D vector) {
        if ((this.x == vector.GetX() && this.y == vector.GetY() && this.z == vector.GetY()))
        //|| this.x - vector.GetX() == this.y - vector.GetY() && this.x - vector.GetX() == this.z - vector.GetZ())
        {
            System.out.println("Эти два вектора равны");
        } else {
            System.out.println("Эти два вектора не равны");

        }
    }
*/
    public void SetX(int x) {
        this.x = x;
    }

    public void SetY(int y) {
        this.y = y;
    }

    public void SetZ(int z) {
        this.z = z;
    }

    public int GetX() {
        return x;
    }

    public int GetY() {
        return y;
    }

    public int GetZ() {
        return z;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vector3D vector3D = (Vector3D) o;
        return x == vector3D.x && y == vector3D.y && z == vector3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
