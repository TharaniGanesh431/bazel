# Audit summary

Summary for [Jenkins instance](http://localhost:8080/)

- GitHub Actions Importer version: **1.3.21779 (316a8a190063ab5fcc339860882a6ad6c414c32c)**
- Performed at: **11/19/23 at 12:58**

## Pipelines

Total: **3**

- Successful: **2 (66%)**
- Partially successful: **1 (33%)**
- Unsupported: **0 (0%)**
- Failed: **0 (0%)**

### Job types

Supported: **3 (100%)**

- flow-definition: **3**

### Build steps

Total: **11**

Known: **10 (90%)**

- sh: **3**
- withCredentials: **2**
- echo: **1**
- archiveArtifacts: **1**
- checkout: **1**
- junit: **1**
- git: **1**

Unknown: **1 (9%)**

- rtUpload: **1**

Actions: **15**

- actions/checkout@v4.1.0: **8**
- run: **5**
- actions/upload-artifact@v3.1.3: **1**
- EnricoMi/publish-unit-test-result-action@v2.11.0: **1**

### Triggers

Total: **0**

Actions: **3**

- workflow_dispatch: **3**

### Environment

Total: **0**

### Other

Total: **0**

### Manual tasks

Total: **3**

Secrets: **3**

- `${{ secrets.GITHUB_TOKEN_GITHUB_TOKEN }}`: **1**
- `${{ secrets.MY_ARTIFACTORY_CRED_USERNAME }}`: **1**
- `${{ secrets.MY_ARTIFACTORY_CRED_PASSWORD }}`: **1**

### Successful

#### Build

- [Build/.github/workflows/build.yml](Build/.github/workflows/build.yml)
- [Build/config.json](Build/config.json)
- [Build/jenkinsfile](Build/jenkinsfile)

#### Hello_World

- [Hello_World/.github/workflows/hello_world.yml](Hello_World/.github/workflows/hello_world.yml)
- [Hello_World/config.json](Hello_World/config.json)
- [Hello_World/jenkinsfile](Hello_World/jenkinsfile)

### Partially successful

#### Deploy

- [Deploy/.github/workflows/deploy.yml](Deploy/.github/workflows/deploy.yml)
- [Deploy/config.json](Deploy/config.json)
- [Deploy/jenkinsfile](Deploy/jenkinsfile)
