package Response.SubjectResponse;

public class GetSubjectByIdResponse {
    private String name;

    public GetSubjectByIdResponse() {}

    public GetSubjectByIdResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getName(String name) {
        this.name = name;
    }
}
