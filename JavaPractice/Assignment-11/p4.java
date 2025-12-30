// Problem 3: Online Learning Platform 

// Abstract class Course:

// title, duration fields

// abstract method startCourse(), endCourse()

// concrete method courseDetails()

// Subclasses:

// VideoCourse

// LiveCourse

// Interface CertificateProvider with generateCertificate() method.

// Only VideoCourse provides certificates.

// In main method, simulate starting, ending, and generating certificates.

interface CertificateProvider {
    void generateCertificate();
}

abstract class Course {
    protected String title;
    protected int duration;

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract void startCourse();

    public abstract void endCourse();

    public void courseDetails() {
        System.out.println("Course: " + title + ", Duration: " + duration + " hours");
    }
}

class VideoCourse extends Course implements CertificateProvider {
    public VideoCourse(String title, int duration) {
        super(title, duration);
    }

    public void startCourse() {
        System.out.println("Video course '" + title + "' started. Watch at your own pace.");
    }

    public void endCourse() {
        System.out.println("Video course '" + title + "' ended.");
    }

    public void generateCertificate() {
        System.out.println("Certificate generated for video course: " + title);
    }
}

class LiveCourse extends Course {
    public LiveCourse(String title, int duration) {
        super(title, duration);
    }

    public void startCourse() {
        System.out.println("Live course '" + title + "' started. ");
    }

    public void endCourse() {
        System.out.println("Live course '" + title + "' ended.");
    }
}

class Main {
    public static void main(String[] args) {
        Course video = new VideoCourse("Java Basics", 10);
        Course live = new LiveCourse("Advanced Algorithms Live", 8);

        video.courseDetails();
        video.startCourse();
        video.endCourse();

        ((CertificateProvider) video).generateCertificate();

        live.courseDetails();
        live.startCourse();
        live.endCourse();
    }
}
