package SOLID_Principles.LSP.incorrect;
/*
 * The Liskov Substitution Principle (LSP) states that objects of a subclass should be able to
 * replace objects of the superclass without affecting the functionality of the program.
 *
 * In the example below, all methods in the base class are abstract, requiring any subclass
 * to provide its implementation. However, if the 'SocialMedia' class is extended by a class
 * like 'WhatsApp', the 'publishPost' method would not be relevant or useful,
 * leading to a violation of the Liskov Substitution Principle.
 * In this case, substituting 'SocialMedia' with 'WhatsApp' could break the expected behavior.
 */

public abstract class SocialMedia {
    public abstract void chatWithFriend();
    public abstract void sendPhotosAndVideos();
    public abstract void publishPost();
    public abstract void groupVideoCall();
}
