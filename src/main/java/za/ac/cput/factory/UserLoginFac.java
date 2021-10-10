<<<<<<< HEAD
package za.ac.cput.factory;

/*  UserLoginFac.java
    User Login entity factory
    Author: Taahir Boltman(218022972)
    Date: 10 June 2021
 */

import za.ac.cput.entity.UserLogin;
import za.ac.cput.util.GenericHelper;

public class UserLoginFac {

    public static UserLogin createLogin(String userName, String password){

        String userId = GenericHelper.generateId();

        UserLogin login = new UserLogin.Builder()
                .setUserId(userId)
                .setUserName(userName)
                .setPassword(password)
                .build();

        return login;
    }
}
=======
package za.ac.cput.factory;

/*  UserLoginFac.java
    User Login entity factory
    Author: Taahir Boltman(218022972)
    Date: 10 June 2021
 */

import za.ac.cput.entity.UserLogin;
import za.ac.cput.util.GenericHelper;

public class UserLoginFac {

    public static UserLogin createLogin(String userName, String password){

        String userId = GenericHelper.generateId();

        UserLogin login = new UserLogin.Builder()
                .setUserId(userId)
                .setUserName(userName)
                .setPassword(password)
                .build();

        return login;
    }
}
>>>>>>> 5f71e25dfbc24a5a533788550a294bb02db12b1c
