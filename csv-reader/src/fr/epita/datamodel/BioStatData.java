package fr.epita.datamodel;

public class BioStatData {

    private String sex;
    private Integer weightSeptember;

    private Double bmiSeptember;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getWeightSeptember() {
        return weightSeptember;
    }

    public void setWeightSeptember(Integer weightSeptember) {
        this.weightSeptember = weightSeptember;
    }

    public Double getBmiSeptember() {
        return bmiSeptember;
    }

    public void setBmiSeptember(Double bmiSeptember) {
        this.bmiSeptember = bmiSeptember;
    }

    @Override
    public String toString() {
        return "BioStatData{" +
                "sex='" + sex + '\'' +
                ", weightSeptember=" + weightSeptember +
                ", bmiSeptember=" + bmiSeptember +
                '}';
    }
}
