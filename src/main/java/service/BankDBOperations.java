package service;

import exception.BankNotFoundException;
import exception.UserNotFoundException;
import module.Bank;
import module.User;

import java.util.ArrayList;
import java.util.List;

public class BankDBOperations {

   private static List<Bank> bankDB = new ArrayList<>();

    public void addBanks(List<Bank> bankList){
        bankDB.addAll(bankList);
    }


    public void removeBank(String deleteBankName) throws BankNotFoundException{

        for(int counter=0;counter< bankDB.size();counter++) {
            Bank bank = bankDB.get(counter);
            if (deleteBankName.equalsIgnoreCase(bank.getBankName())){
                bankDB.remove(bank);
                break;
            }
            else if(counter == (bankDB.size() -1)){
                throw new BankNotFoundException("Bank is not available");
            }
        }
    }

    public void removeUser(String deleteUserName) throws UserNotFoundException {

        for(int counter=0;counter< bankDB.size();counter++) {
            Bank bank = bankDB.get(counter);
            List<User> userList = bank.getUsers();

            for(int i = 0;i<userList.size();i++){

                if (deleteUserName.equalsIgnoreCase(userList.get(i).getUserName())){

                    userList.remove(i);
                }

                else if(counter == (userList.size() -1)){
                    throw new UserNotFoundException("User is not available");
                }
            }
        }
    }

    public boolean checkBankIfExists(){

        return false;
    }


    public void printAllDetails(){
        bankDB.forEach((bank)->{
            System.out.println(bank.getBankName());
            List<User> userList  = bank.getUsers();

            userList.forEach((user)->{
                System.out.println(user.getUserName());
            });
        });

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

    }
}




