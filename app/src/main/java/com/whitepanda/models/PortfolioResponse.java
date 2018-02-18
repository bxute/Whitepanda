package com.whitepanda.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PortfolioResponse {

    @Expose
    @SerializedName("done")
    public boolean done;
    @Expose
    @SerializedName("code")
    public int code;
    @Expose
    @SerializedName("data")
    public Data data;

    public PortfolioResponse(boolean done, int code, Data data) {
        this.done = done;
        this.code = code;
        this.data = data;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "PortfolioResponse{" +
                "done=" + done +
                ", code=" + code +
                ", data=" + data +
                '}';
    }

    public static class PersonalDetails {
        @Expose
        @SerializedName("firstname")
        public String firstname;
        @Expose
        @SerializedName("lastname")
        public String lastname;
        @Expose
        @SerializedName("city")
        public String city;
        @Expose
        @SerializedName("state")
        public String state;
        @Expose
        @SerializedName("headline")
        public String headline;
        @Expose
        @SerializedName("email")
        public String email;
        @Expose
        @SerializedName("mobile")
        public String mobile;
        @Expose
        @SerializedName("bio")
        public String bio;

        public PersonalDetails(String firstname, String lastname, String city, String state, String headline, String email, String mobile, String bio) {
            this.firstname = firstname;
            this.lastname = lastname;
            this.city = city;
            this.state = state;
            this.headline = headline;
            this.email = email;
            this.mobile = mobile;
            this.bio = bio;
        }

        public String getFirstname() {
            return firstname;
        }

        public void setFirstname(String firstname) {
            this.firstname = firstname;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        @Override
        public String toString() {
            return "PersonalDetails{" +
                    "firstname='" + firstname + '\'' +
                    ", lastname='" + lastname + '\'' +
                    ", city='" + city + '\'' +
                    ", state='" + state + '\'' +
                    ", headline='" + headline + '\'' +
                    ", email='" + email + '\'' +
                    ", mobile='" + mobile + '\'' +
                    ", bio='" + bio + '\'' +
                    '}';
        }
    }

    public static class Work {
        @Expose
        @SerializedName("id")
        public String id;
        @Expose
        @SerializedName("organization")
        public String organization;
        @Expose
        @SerializedName("location")
        public String location;
        @Expose
        @SerializedName("position")
        public String position;
        @Expose
        @SerializedName("from_date")
        public String fromDate;
        @Expose
        @SerializedName("from_month")
        public String fromMonth;
        @Expose
        @SerializedName("from_year")
        public String fromYear;
        @Expose
        @SerializedName("to_date")
        public String toDate;
        @Expose
        @SerializedName("to_month")
        public String toMonth;
        @Expose
        @SerializedName("to_year")
        public String toYear;
        @Expose
        @SerializedName("present")
        public String present;
        @Expose
        @SerializedName("description")
        public String description;

        public Work(String id, String organization, String location, String position, String fromDate, String fromMonth, String fromYear, String toDate, String toMonth, String toYear, String present, String description) {
            this.id = id;
            this.organization = organization;
            this.location = location;
            this.position = position;
            this.fromDate = fromDate;
            this.fromMonth = fromMonth;
            this.fromYear = fromYear;
            this.toDate = toDate;
            this.toMonth = toMonth;
            this.toYear = toYear;
            this.present = present;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrganization() {
            return organization;
        }

        public void setOrganization(String organization) {
            this.organization = organization;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getPosition() {
            return position;
        }

        public void setPosition(String position) {
            this.position = position;
        }

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public String getFromMonth() {
            return fromMonth;
        }

        public void setFromMonth(String fromMonth) {
            this.fromMonth = fromMonth;
        }

        public String getFromYear() {
            return fromYear;
        }

        public void setFromYear(String fromYear) {
            this.fromYear = fromYear;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public String getToMonth() {
            return toMonth;
        }

        public void setToMonth(String toMonth) {
            this.toMonth = toMonth;
        }

        public String getToYear() {
            return toYear;
        }

        public void setToYear(String toYear) {
            this.toYear = toYear;
        }

        public String getPresent() {
            return present;
        }

        public void setPresent(String present) {
            this.present = present;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        @Override
        public String toString() {
            return "Work{" +
                    "id='" + id + '\'' +
                    ", organization='" + organization + '\'' +
                    ", location='" + location + '\'' +
                    ", position='" + position + '\'' +
                    ", fromDate='" + fromDate + '\'' +
                    ", fromMonth='" + fromMonth + '\'' +
                    ", fromYear='" + fromYear + '\'' +
                    ", toDate='" + toDate + '\'' +
                    ", toMonth='" + toMonth + '\'' +
                    ", toYear='" + toYear + '\'' +
                    ", present='" + present + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }
    }

    public static class Education {
        @Expose
        @SerializedName("id")
        public String id;
        @Expose
        @SerializedName("school")
        public String school;
        @Expose
        @SerializedName("location")
        public String location;
        @Expose
        @SerializedName("degree")
        public String degree;
        @Expose
        @SerializedName("from_date")
        public String fromDate;
        @Expose
        @SerializedName("from_month")
        public String fromMonth;
        @Expose
        @SerializedName("from_year")
        public String fromYear;
        @Expose
        @SerializedName("to_date")
        public String toDate;
        @Expose
        @SerializedName("to_month")
        public String toMonth;
        @Expose
        @SerializedName("to_year")
        public String toYear;
        @Expose
        @SerializedName("present")
        public String present;
        @Expose
        @SerializedName("description")
        public String description;

        public Education(String id, String school, String location, String degree, String fromDate, String fromMonth, String fromYear, String toDate, String toMonth, String toYear, String present, String description) {
            this.id = id;
            this.school = school;
            this.location = location;
            this.degree = degree;
            this.fromDate = fromDate;
            this.fromMonth = fromMonth;
            this.fromYear = fromYear;
            this.toDate = toDate;
            this.toMonth = toMonth;
            this.toYear = toYear;
            this.present = present;
            this.description = description;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getDegree() {
            return degree;
        }

        public void setDegree(String degree) {
            this.degree = degree;
        }

        public String getFromDate() {
            return fromDate;
        }

        public void setFromDate(String fromDate) {
            this.fromDate = fromDate;
        }

        public String getFromMonth() {
            return fromMonth;
        }

        public void setFromMonth(String fromMonth) {
            this.fromMonth = fromMonth;
        }

        public String getFromYear() {
            return fromYear;
        }

        public void setFromYear(String fromYear) {
            this.fromYear = fromYear;
        }

        public String getToDate() {
            return toDate;
        }

        public void setToDate(String toDate) {
            this.toDate = toDate;
        }

        public String getToMonth() {
            return toMonth;
        }

        public void setToMonth(String toMonth) {
            this.toMonth = toMonth;
        }

        public String getToYear() {
            return toYear;
        }

        public void setToYear(String toYear) {
            this.toYear = toYear;
        }

        public String getPresent() {
            return present;
        }

        public void setPresent(String present) {
            this.present = present;
        }

        public String getDescription() {
            return description;
        }

        @Override
        public String toString() {
            return "Education{" +
                    "id='" + id + '\'' +
                    ", school='" + school + '\'' +
                    ", location='" + location + '\'' +
                    ", degree='" + degree + '\'' +
                    ", fromDate='" + fromDate + '\'' +
                    ", fromMonth='" + fromMonth + '\'' +
                    ", fromYear='" + fromYear + '\'' +
                    ", toDate='" + toDate + '\'' +
                    ", toMonth='" + toMonth + '\'' +
                    ", toYear='" + toYear + '\'' +
                    ", present='" + present + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

        public void setDescription(String description) {
            this.description = description;

        }


    }

    public static class Skills {
        @Expose
        @SerializedName("name")
        public String name;

        public Skills(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Skills{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class PublishedArticles {
        @Expose
        @SerializedName("url")
        public String url;
        @Expose
        @SerializedName("title")
        public String title;
        @Expose
        @SerializedName("description")
        public String description;
        @Expose
        @SerializedName("image")
        public String image;


        public PublishedArticles(String url, String title, String description, String image) {
            this.url = url;
            this.title = title;
            this.description = description;
            this.image = image;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        @Override
        public String toString() {
            return "PublishedArticles{" +
                    "url='" + url + '\'' +
                    ", title='" + title + '\'' +
                    ", description='" + description + '\'' +
                    ", image='" + image + '\'' +
                    '}';
        }
    }

    public static class Data {
        @Expose
        @SerializedName("personal_details")
        public PersonalDetails personalDetails;
        @Expose
        @SerializedName("work")
        public List<Work> work;
        @Expose
        @SerializedName("education")
        public List<Education> education;
        @Expose
        @SerializedName("skills")
        public List<Skills> skills;
        @Expose
        @SerializedName("published_articles")
        public List<PublishedArticles> publishedArticles;

        public Data(PersonalDetails personalDetails, List<Work> work, List<Education> education, List<Skills> skills, List<PublishedArticles> publishedArticles) {
            this.personalDetails = personalDetails;
            this.work = work;
            this.education = education;
            this.skills = skills;
            this.publishedArticles = publishedArticles;
        }

        public PersonalDetails getPersonalDetails() {
            return personalDetails;
        }

        public void setPersonalDetails(PersonalDetails personalDetails) {
            this.personalDetails = personalDetails;
        }

        public List<Work> getWork() {
            return work;
        }

        public void setWork(List<Work> work) {
            this.work = work;
        }

        public List<Education> getEducation() {
            return education;
        }

        public void setEducation(List<Education> education) {
            this.education = education;
        }

        public List<Skills> getSkills() {
            return skills;
        }

        public void setSkills(List<Skills> skills) {
            this.skills = skills;
        }

        public List<PublishedArticles> getPublishedArticles() {
            return publishedArticles;
        }

        public void setPublishedArticles(List<PublishedArticles> publishedArticles) {
            this.publishedArticles = publishedArticles;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "personalDetails=" + personalDetails +
                    ", work=" + work +
                    ", education=" + education +
                    ", skills=" + skills +
                    ", publishedArticles=" + publishedArticles +
                    '}';
        }
    }
}
