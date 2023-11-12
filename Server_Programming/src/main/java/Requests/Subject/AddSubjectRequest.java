package Requests.Subject;

public class AddSubjectRequest {
    private String name;

    public AddSubjectRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
