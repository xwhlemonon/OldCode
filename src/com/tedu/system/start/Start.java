package com.tedu.system.start;

import com.tedu.system.person.*;

public class Start {
    public static Person directorOfTeachingAndResearch = new DirectorOfTeachingAndResearch("张力", 25, 6000);
    public static Person lecturer = new Lecturer("莫子", 20, 3000);
    public static Person projectManager = new ProjectManager("熊文浩", 24, 6000);
    public static Person teacherChargeClass = new TeacherChargeClass("茧子", 24, 6500);

    public static void main(String[] args) {
        directorOfTeachingAndResearch.clockIn(directorOfTeachingAndResearch);
        directorOfTeachingAndResearch.finishWork(directorOfTeachingAndResearch);
        ((DirectorOfTeachingAndResearch) directorOfTeachingAndResearch).solveProblem(directorOfTeachingAndResearch);
        ((DirectorOfTeachingAndResearch) directorOfTeachingAndResearch).trainEnterpriseEmployees(directorOfTeachingAndResearch);
        ((DirectorOfTeachingAndResearch) directorOfTeachingAndResearch).editBook(directorOfTeachingAndResearch);
        directorOfTeachingAndResearch.clockOut(directorOfTeachingAndResearch);
        lecturer.clockIn(lecturer);
        lecturer.finishWork(lecturer);
        ((Lecturer) lecturer).solveProblem(lecturer);
        ((Lecturer) lecturer).trainEnterpriseEmployees(lecturer);
        ((Lecturer) lecturer).editBook(lecturer);
        lecturer.clockOut(lecturer);
        projectManager.clockIn(projectManager);
        projectManager.finishWork(projectManager);
        ((ProjectManager) projectManager).editBook(projectManager);
        projectManager.clockOut(projectManager);
        teacherChargeClass.clockIn(teacherChargeClass);
        teacherChargeClass.finishWork(teacherChargeClass);
        teacherChargeClass.clockOut(teacherChargeClass);
    }
}
