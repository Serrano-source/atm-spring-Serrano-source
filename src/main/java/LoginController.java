/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // Devuelve el nombre de la plantilla de inicio de sesión
    }

    @PostMapping("/login")
    public ModelAndView login(@RequestParam String username, @RequestParam String password) {
        // Aquí puedes validar las credenciales y realizar el inicio de sesión
        // Si el inicio de sesión es exitoso, redirige a la página de plantilla
        if (validarCredenciales(username, password)) {
            return new ModelAndView("redirect:/plantilla");
        } else {
            // Si el inicio de sesión falla, puedes redirigir a una página de error o volver a la página de inicio de sesión
            return new ModelAndView("redirect:/login?error=true");
        }
    }

    private boolean validarCredenciales(String username, String password) {
        // Aquí puedes agregar la lógica para validar las credenciales del usuario
        // Por ejemplo, podrías verificar en una base de datos si el usuario y la contraseña son válidos
        // Por simplicidad, en este ejemplo, siempre devolveremos verdadero
        return true;
    }
}