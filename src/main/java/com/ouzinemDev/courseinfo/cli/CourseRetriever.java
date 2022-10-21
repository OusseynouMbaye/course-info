package com.ouzinemDev.courseinfo.cli;

public class CourseRetriever {
    public static void main(String[] args) {
        out("CourseRetriever started");
        if (args.length == 0) {
            out("Please provide an author name as first argument");
            return;
        }
      try {
          retrieveCourses(args[0]);
      }catch (Exception e){
          out("Unexpected error");
          e.printStackTrace();
      }
    }

    private static void retrieveCourses(String authorId) {
        out("Retrieving course for author " + authorId);
    }

    public static void out(Object o) {
        System.out.println(o.toString());
    }
}
