import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department department = new Department();
        department.id=1;
        department.name="Kế toán";
        System.out.println("department = " + department.name);
        Position position = new Position();
        PositionName positionName = PositionName.Dev;
        position.id = 2;
        System.out.println("position = " + position.positionName);

        Account account = new Account();
        account.id = 3;
        account.email = "A@gmail.com";
        account.userName = "Sang";
        account.fullName = "Phùng Xuân Sáng";
        account.departmentId = 1;
        account.createDate = LocalDate.now();
        System.out.println("account = " + account.fullName);

        Group group = new Group();
        group.id = 4;
        group.name ="B502";
        group.createId = 5;
        group.createDate = LocalDate.now();
        System.out.println("group = " + group.name);

        GroupAccount groupAccount = new GroupAccount();
        groupAccount.groupId = 4;
        groupAccount.accountId = 3;
        groupAccount.joinDate = LocalDate.of(2024,4,13);
        System.out.println("groupAccount = " + groupAccount.joinDate);

        TypeQuestion typeQuestion = new TypeQuestion();
        TypeName typeName = TypeName.Essay;
        typeQuestion.id = 6;
        System.out.println("typeQuestion = " + typeQuestion.name);

        CategoryQuestion categoryQuestion = new CategoryQuestion();
            categoryQuestion.id = 7;
            categoryQuestion.name = "Jav";
        System.out.println("categoryQuestion = " + categoryQuestion.name);
        Question question = new Question();
        question.id = 8;
        question.content = "Bài học số 2";
        question.categoryId = 5;
        question.typeId = 4;
        question.creatorId = 6;
        question.createDate = LocalDate.now();
        System.out.println("question = " + question.content);

        Answer answer = new Answer();
        answer.id = 10;
        answer.isCorrect = true;
        answer.content = "Luôn đúng";
        answer.questionId = 3;
        System.out.println("answer = " + answer.content);

        Exam exam = new Exam();
            exam.id = 11;
            exam.code = "PH12343";
            exam.title = "Tiêu đề";
            exam.categoryId = 4;
            exam.duration = LocalDate.now();
            exam.creatorId = 5;
            //ss
            exam.createDate = LocalDate.now();
        System.out.println("exam = " + exam.title);

        ExamQuestion examQuestion = new ExamQuestion();
        examQuestion.examId = 11;
        examQuestion.questionId = 8;
        System.out.println("examQuestion = " + examQuestion.examId);

        // question_01

    }


}
