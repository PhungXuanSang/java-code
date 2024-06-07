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
        account.positionId = 3;
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
    if (account.departmentId == 0){
        System.out.println("Nhân vien này chua có phòng ban");
    }else {
        System.out.println("Phòng ban của nhân vien này là "+department.name);
    }

        // Question_02
    if (account.id == groupAccount.accountId){
        if (groupAccount.groupId == 0){
            System.out.println("Nhan Vien nay chua co group");
        }else if (groupAccount.groupId==group.id){
            System.out.println("Nhan vien nay da co group");
        }
    }

        // Question_03
        System.out.println(account.departmentId==0 ? "Nhan vien nay chua co group" : "Nhan vien nay da co group ");

        // question_04
        System.out.println(account.positionId==1 ? "Day la Dev" : "Nguoi nay khong phai dev");


        // question_05
        switch (groupAccount.accountId = 3){
            case 1 :
                System.out.println("Nhóm có 1 thành viên");
                break;
            case 2 :
                System.out.println("Nhoms có 2 thành viên");
                break;
            case 3 :
                System.out.println("Nhoms có 3 thành viên");
                break;
            default:
                System.out.println("Nhóm khong có thành viên nao");
                break;
        }
        // question_06
        switch (groupAccount.groupId =2){
            case 1 :
                System.out.println("Group nay co 1 group");
                break;
            case  2 :
                System.out.println("Nhan vien nay co 2 group");
                break;
            case  3 :
                System.out.println("Nhan vien nay co 3 group");
                break;
            default:
                System.out.println("Nhan vien nay chua co group");
                break;
        }

}
}
