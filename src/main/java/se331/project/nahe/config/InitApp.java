package se331.project.nahe.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.project.nahe.entity.Student;
import se331.project.nahe.repository.StudentRepository;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final StudentRepository studentRepository;
    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
        studentRepository.save(Student.builder()
                .name("Thiwakon")
                .surname("Sakunchao").build());
        studentRepository.save(Student.builder()
                .name("Sorawee")
                .surname("Sakunchao").build());
        studentRepository.save(Student.builder()
                .name("Putthipong")
                .surname("Ninwong").build());
    }
}
