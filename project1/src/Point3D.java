import java.util.Objects;

public class Point3D {
    private int x, y, z;


    public Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D() {
        x = 0;
        y = 0;
        z = 0;
    }

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

    public void PointOut() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return x == point3D.x && y == point3D.y && z == point3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
