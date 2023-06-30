public class Main {

    public static void main(String[] args) throws InvalidAuthenticationException {

        AccountManager accountManager = new AccountManager();


        //created user1
        User user1 = new User("Süleyman", "Alper", "suleymanalper00@gmail.com", "123456", "Student", 20);

        //insurance added
        user1.getInsurances().add(new TravelInsurance(50000));

        //our user now has an address or addresses
        AddressManager addressManager = new AddressManager(user1);
        addressManager.addAddress((new HomeAddress("Türkiye","İstanbul","Sultangazi", "X","Y")));

        //now user1 has an individualAccount
        Account indAcc1 = new IndıvıdualAccount(user1);

        //account added to dataList !!
        accountManager.getDataList().add(indAcc1);

        accountManager.login("suleymanalper00@gmail.com", "123456");



    }

    @SuppressWarnings("serial")
    static
    class InvalidAuthenticationException extends Exception {
        public InvalidAuthenticationException(String message) {
            super(message);
        }
    }
}

