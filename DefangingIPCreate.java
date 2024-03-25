package LeetCode;
/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */
public class DefangingIPCreate {
    public static void main(String[] args) {
        DefangingIPCreate obj = new DefangingIPCreate();
        System.out.println( obj.defangIPaddr( "255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        return    address.replace(".","[.]");
    }
}
