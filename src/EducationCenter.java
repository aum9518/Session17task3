import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String LocatedCountry;
    private LocalDate foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate foundationYear) {
        this.name = name;
        LocatedCountry = locatedCountry;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return LocatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        LocatedCountry = locatedCountry;
    }

    public LocalDate getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(LocalDate foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return "EducationCenter{" +
                "name='" + name + '\'' +
                ", LocatedCountry='" + LocatedCountry + '\'' +
                ", foundationYear=" + foundationYear +
                '}';
    }
}
