package se331.project.nahe.config;

import com.se331.nahe.entity.Student;
import com.se331.nahe.entity.Teacher;
import com.se331.nahe.repository.StudentRepository;
import com.se331.nahe.repository.TeacherRepository;
import com.se331.nahe.security.user.Role;
import com.se331.nahe.security.user.User;
import com.se331.nahe.security.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final StudentRepository studentRepository;
    final TeacherRepository teacherRepository;
    final UserRepository userRepository;

    @Override
    @Transactional
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {

        PasswordEncoder encoder = new BCryptPasswordEncoder();

        User admin = new User();
        admin.setUsername("admin");
        admin.setFirstname("admin");
        admin.setLastname("admin");
        admin.setPassword(encoder.encode("admin"));
        admin.setEmail("admin@admin.com");
        admin.setRoles(List.of(Role.ROLE_ADMIN));
        userRepository.save(admin);

        User userT1 = new User();
        userT1.setUsername("DoctorFish");
        userT1.setFirstname("Doctor");
        userT1.setLastname("Fish");
        userT1.setPassword("54321");
        userT1.setEmail("email@email.com");
        userT1.setRoles(List.of(Role.ROLE_TEACHER));
        userT1.setImage("https://storage-wp.thaipost.net/2022/05/%E0%B8%AB%E0%B8%A1%E0%B8%AD%E0%B8%9B%E0%B8%A5%E0%B8%B2-3.jpg");
        userRepository.save(userT1);


        User userT2 = new User();
        userT2.setUsername("Ricardo");
        userT2.setFirstname("Ricardo");
        userT2.setLastname("Milos");
        userT2.setPassword("54321");
        userT2.setEmail("Ricardo@Milos.com");
        userT2.setRoles(List.of(Role.ROLE_TEACHER));
        userT2.setImage("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTKuytkKRrbL9cS7FhwW8ywHptwKj0oE63Fz0MUKuvBgrltibfwXvmBHUeadM_nreicaqs&usqp=CAU");
        userRepository.save(userT2);

        User userT3 = new User();
        userT3.setUsername("BillyHerrington");
        userT3.setFirstname("Billy");
        userT3.setLastname("Herrington");
        userT3.setEmail("Billy@Herrington.com");
        userT3.setPassword("54321");
        userT3.setRoles(List.of(Role.ROLE_TEACHER));
        userT3.setImage("https://i1.sndcdn.com/avatars-000411292317-dt2f28-t500x500.jpg");
        userRepository.save(userT3);

        User userT4 = new User();
        userT4.setUsername("MasterTurtle");
        userT4.setFirstname("Master");
        userT4.setLastname("Roshi");
        userT4.setEmail("Master@Roshi.com");
        userT4.setPassword("54321");
        userT4.setRoles(List.of(Role.ROLE_TEACHER));
        userT4.setImage("https://i.ibb.co/9qyLBJm/Master-roshi-enhanced.webp");
        userRepository.save(userT4);

        User userT5 = new User();
        userT5.setUsername("ambatukam");
        userT5.setFirstname("Dreamy");
        userT5.setLastname("Bull");
        userT5.setEmail("Dreamy@Bull.com");
        userT5.setPassword("Chaplin132");
        userT5.setRoles(List.of(Role.ROLE_TEACHER));
        userT5.setImage("https://i1.sndcdn.com/artworks-CnVRs1wSaUG51r6t-hYuXBA-t500x500.jpg");
        userRepository.save(userT5);

        User userS1 = new User();
        userS1.setUsername("Yanwarut");
        userS1.setFirstname("Yanwarut");
        userS1.setLastname("Suksawat");
        userS1.setEmail("Yanwarut@Suksawat.com");
        userS1.setPassword("12345");
        userS1.setRoles(List.of(Role.ROLE_STUDENT));
        userS1.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student1.JPG");
        userRepository.save(userS1);

        User userS2 = new User();
        userS2.setUsername("Cherprang");
        userS2.setFirstname("Cherprang");
        userS2.setLastname("BNK48");
        userS2.setPassword("12345");
        userS2.setEmail("Cherprang@BNK48.com");
        userS2.setRoles(List.of(Role.ROLE_STUDENT));
        userS2.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student22.JPG");
        userRepository.save(userS2);

        User userS3 = new User();
        userS3.setUsername("Nobi");
        userS3.setFirstname("Nobi");
        userS3.setLastname("Nobita");
        userS3.setPassword("12345");
        userS3.setEmail("Nobi@Nobita.com");
        userS3.setRoles(List.of(Role.ROLE_STUDENT));
        userS3.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student6.JPG");
        userRepository.save(userS3);

        User userS4 = new User();
        userS4.setUsername("Asher");
        userS4.setFirstname("Asher");
        userS4.setLastname("Barton");
        userS4.setPassword("12345");
        userS4.setEmail("Asher@Barton.com");
        userS4.setRoles(List.of(Role.ROLE_STUDENT));
        userS4.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student7.JPG");
        userRepository.save(userS4);

        User userS5 = new User();
        userS5.setUsername("Ignatius");
        userS5.setFirstname("Ignatius");
        userS5.setLastname("Sears");
        userS5.setPassword("12345");
        userS5.setEmail("Ignatius@Sears.com");
        userS5.setRoles(List.of(Role.ROLE_STUDENT));
        userS5.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student8.JPG");
        userRepository.save(userS5);

        User userS6 = new User();
        userS6.setUsername("Rebecca");
        userS6.setFirstname("Rebecca");
        userS6.setLastname("Gordon");
        userS6.setPassword("12345");
        userS6.setEmail("Rebecca@Gordon.com");
        userS6.setRoles(List.of(Role.ROLE_STUDENT));
        userS6.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student3.JPG");
        userRepository.save(userS6);

        User userS7 = new User();
        userS7.setUsername("Upton");
        userS7.setFirstname("Upton");
        userS7.setLastname("Glover");
        userS7.setPassword("12345");
        userS7.setEmail("Upton@Glover.com");
        userS7.setRoles(List.of(Role.ROLE_STUDENT));
        userS7.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student4.JPG");
        userRepository.save(userS7);

        User userS8 = new User();
        userS8.setUsername("Macon");
        userS8.setFirstname("Macon");
        userS8.setLastname("Albert");
        userS8.setPassword("12345");
        userS8.setEmail("Macon@Albert.com");
        userS8.setRoles(List.of(Role.ROLE_STUDENT));
        userS8.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student5.JPG");
        userRepository.save(userS8);

        User userS9 = new User();
        userS9.setUsername("Kaikaew");
        userS9.setFirstname("Kru");
        userS9.setLastname("Kaikaew");
        userS9.setPassword("12345");
        userS9.setEmail("Kaikaew@Kru.com");
        userS9.setRoles(List.of(Role.ROLE_STUDENT));
        userS9.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student9.JPG");
        userRepository.save(userS9);

        User userS10 = new User();
        userS10.setUsername("Oppenheimer");
        userS10.setFirstname("Robert");
        userS10.setLastname("Oppenheimer");
        userS10.setPassword("12345");
        userS10.setEmail("Robert@Oppenheimer.com");
        userS10.setRoles(List.of(Role.ROLE_STUDENT));
        userS10.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student27.JPG");
        userRepository.save(userS10);

        User userS11 = new User();
        userS11.setUsername("Heisenberg");
        userS11.setFirstname("Walter");
        userS11.setLastname("White");
        userS11.setPassword("12345");
        userS11.setEmail("Walter@White.com");
        userS11.setRoles(List.of(Role.ROLE_STUDENT));
        userS11.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student26.JPG");
        userRepository.save(userS11);

        User userS12 = new User();
        userS12.setUsername("Pinkeman");
        userS12.setFirstname("Jesse");
        userS12.setLastname("Pinkeman");
        userS12.setPassword("12345");
        userS12.setEmail("Jesse@Pinkeman.com");
        userS12.setRoles(List.of(Role.ROLE_STUDENT));
        userS12.setImage("C:/Users/PC/Desktop/New folder/project-02-sodium_helium_einstenium2frontend/src/assets/images/Student12.JPG");
        userRepository.save(userS12);


        Teacher t1 = new Teacher();
        t1.setUser(userT1);
        teacherRepository.save(t1);



        Student s1 = new Student();
        s1.setUser(userS1);
        s1.setTeacher(t1);
        studentRepository.save(s1);

        Teacher t4 = new Teacher();
        t4.setUser(userT4);
        t4.getOwnStudent().add(s1);
        s1.setTeacher(t4);
        teacherRepository.save(t4);
        studentRepository.save(s1);

        Teacher t5 = new Teacher();
        t5.setUser(userT5);

        Student s11 = new Student();
        s11.setUser(userS11);
        s11.setTeacher(t5);
        studentRepository.save(s11);
        t5.getOwnStudent().add(s11);
        teacherRepository.save(t5);

        Student s12 = new Student();
        s12.setUser(userS12);
        s12.setTeacher(t5);
        studentRepository.save(s12);
        t5.getOwnStudent().add(s12);
        teacherRepository.save(t5);

        Student s8 = new Student();
        s8.setUser(userS8);
        s8.setTeacher(t5);
        studentRepository.save(s8);
        t5.setUser(userT5);
        t5.getOwnStudent().add(s8);
        teacherRepository.save(t5);

        Student s9 = new Student();
        s9.setUser(userS9);
        s9.setTeacher(t4);
        studentRepository.save(s9);
        t4.getOwnStudent().add(s9);
        teacherRepository.save(t4);

        Student s10 = new Student();
        s10.setUser(userS10);
        s10.setTeacher(t5);
        studentRepository.save(s10);
        t5.getOwnStudent().add(s10);
        teacherRepository.save(t5);


        Teacher t2 = new Teacher();

        Student s2 = new Student();
        s2.setUser(userS2);
        s2.setTeacher(t2);
        studentRepository.save(s2);

        t2.setUser(userT2);
        t2.getOwnStudent().add(s2);
        s2.setTeacher(t2);
        teacherRepository.save(t2);
        studentRepository.save(s2);

        Teacher t3 = new Teacher();
        t3.setUser(userT3);
        teacherRepository.save(t3);


        Student s3 = new Student();
        s3.setUser(userS3);
        s3.setTeacher(t3);
        studentRepository.save(s3);

        t3.getOwnStudent().add(s3);

        teacherRepository.save(t3);

        Student s4 = new Student();
        s4.setUser(userS4);
        s4.setTeacher(t3);
        studentRepository.save(s4);
        t3.getOwnStudent().add(s4);
        teacherRepository.save(t3);

        Student s5 = new Student();
        s5.setUser(userS5);
        s5.setTeacher(t2);
        studentRepository.save(s5);
        t2.getOwnStudent().add(s5);
        teacherRepository.save(t2);

        Student s6 = new Student();
        s6.setUser(userS6);
        s6.setTeacher(t1);
        studentRepository.save(s6);
        t1.getOwnStudent().add(s6);
        teacherRepository.save(t1);

        Student s7 = new Student();
        s7.setUser(userS7);
        s7.setTeacher(t1);
        studentRepository.save(s7);
        t1.getOwnStudent().add(s7);
        teacherRepository.save(t1);

    }
}
