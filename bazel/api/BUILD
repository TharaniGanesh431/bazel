java_binary(
  name = 'app',
  main_class = 'com.example.bazelspringBoot.Main',
  srcs = glob(['src/**/*.java']),
  deps = [
    '@maven//:org_springframework_boot_spring_boot_test',
    '@maven//:org_springframework_boot_spring_boot',
    '@maven//:org_springframework_boot_spring_boot_autoconfigure',
    '@maven//:org_springframework_boot_spring_boot_starter_web',
    '@maven//:org_springframework_spring_web',
    '@maven//:org_springframework_spring_beans',
    '@maven//:org_junit_jupiter_junit_jupiter_api',
    '//core:greeter'
  ],
)
