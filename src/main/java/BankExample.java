import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import module.User;
import module.Bank;
import service.BankDBOperations;

public class BankExample {


//    public void printBankDetailsService(){
//
//
//        bankDB.forEach((bank)->{
//            System.out.println(bank.getBankName());
//            List<User> userList  = bank.getUsers();
//
//            userList.forEach((user)->{
//                System.out.println(user.getUserName());
//            });
//
//        });

//        for(int i=0;i< bankDB.size();i++){
//
//            List<User> listOfUser = bankDB.get(i).getUsers();
//            System.out.println(bankDB.get(i).getBankName());
//
//            for(int j=0;j< listOfUser.size();j++){
//
//                System.out.println(listOfUser.get(j).getUserName());
//
//            }
//
//        }
//   }

    public static void main(String[] args) {
        BankDBOperations bankDBOperations=new BankDBOperations();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Total Bank: ");
        int totalBank = scanner.nextInt();

        List<Bank> tempBankList=new ArrayList<>();

        while(true){

            for(int l =0; l<totalBank;l++){
                Bank bank = new Bank();
                List<User> usersList = new ArrayList<>();

                System.out.println("Enter Bank Name: ");
                String bankName = scanner.next();
                bank.setBankName(bankName);

                System.out.println("Total user per Bank: ");
                int totalUserPerBank = scanner.nextInt();

                for(int k=0;k<totalUserPerBank;k++){

                    User user = new User();

                    System.out.println("Enter User Name: ");
                    String userName = scanner.next();
                    user.setUserName(userName);
                    usersList.add(user);
                }
                bank.setUsers(usersList);
                tempBankList.add(bank);
            }
            bankDBOperations.addBanks(tempBankList);
            break;
        }
        bankDBOperations.printAllDetails();

//        System.out.println("Which bank do you want to delete? Enter Name: ");
//        String deleteBankName = scanner.next();
       // bankDBOperations.removeBank(deleteBankName);

        System.out.println("Which user do you want to delete? Enter Name: ");
        String deleteUserName = scanner.next();
        bankDBOperations.removeUser(deleteUserName);

        bankDBOperations.printAllDetails();



    }
}