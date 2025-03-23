# 📈 프로젝트 소개

- Java Spring과 외부 API를 이용한 금융 지수 데이터를 한눈에 제공하는 대시보드 서비스
- 프로젝트 기간: 2025.03.13 ~ 2025.03.24

## 🧑‍💻 팀원 구성

|                  김응진                  |                     이민주                     |                      이원길                      |                      이주녕                      |                     허원재                     |
| :--------------------------------------: | :--------------------------------------------: | :----------------------------------------------: | :----------------------------------------------: | :--------------------------------------------: |
|<img width="160px" src="https://avatars.githubusercontent.com/u/138095131?v=4"/>|<img width="160px" src="https://github.com/user-attachments/assets/a7781d01-fea9-4454-97e7-c7c51415f283"/>|<img width="160px" src="https://github.com/user-attachments/assets/5266f84b-8020-427a-8daf-bc2a63456ff6"/>|<img width="160px" src="https://avatars.githubusercontent.com/u/139120379?v=4"/>|<img width="160px" src="https://avatars.githubusercontent.com/u/39307905?v=4"/>|
| [@mmm806](https://github.com/mmm806) | [@m0276](https://github.com/m0276) | [@realitsyourman](https://github.com/realitsyourman) | [@JunyungLee](https://github.com/JunyungLee) | [@Oince](https://github.com/Oince) |
------

## 🔧 기술 스택

<h2 align="center">✨Backend</h2>

<div align="center">
	<img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white">
    <img src="https://img.shields.io/badge/spring data jpa-6DB33F?style=for-the-badge&logo=spring&logoColor=white">
    <img src="https://img.shields.io/badge/java-000000?style=for-the-badge&logo=openjdk&logoColor=white">
    <img src="https://img.shields.io/badge/gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white">
</div>


<h2 align="center">📦️Database</h2>

<div align="center">
	<img src="https://img.shields.io/badge/PostgresQL-4169E1?style=for-the-badge&logo=postgresql&logoColor=white">
</div>

<h2 align="center">🔨Tools</h2>

<div align="center">
	<img src="https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white">
	<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
    <img src="https://img.shields.io/badge/Discord-5865F2?style=for-the-badge&logo=discord&logoColor=white">
    <img src="https://img.shields.io/badge/IntelliJ IDEA-000000?style=for-the-badge&logo=intellijidea&logoColor=white">
</div>


------

## 📝 팀원별 구현 기능 상세

### 김응진

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

### 이민주

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

### 이원길

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

### 이주녕

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

### 허원재

(자신이 개발한 기능에 대한 사진이나 gif 파일 첨부)

- 구현1
  - 설명1
- 구현2
  - 설명2

------

## 🗃️ 파일 구조

```plaintext
src
 ┣ main
 ┃ ┣ java
 ┃ ┃ ┣ com
 ┃ ┃ ┃ ┣ sprint
 ┃ ┃ ┃ ┃ ┣ findex_team6
 ┃ ┃ ┃ ┃ ┃ ┣ batch
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ BatchAutoSyncIndexData.java
 ┃ ┃ ┃ ┃ ┃ ┣ config
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ QueryDSLConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ RestTemplateConfig.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SwaggerConfig.java
 ┃ ┃ ┃ ┃ ┃ ┣ controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobsController.java
 ┃ ┃ ┃ ┃ ┃ ┣ dto
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ dashboard
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ ChartDataPoint.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexChartDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexPerformanceDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValCsvDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ RankedIndexPerformanceDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ request
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigCursorPageRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataQueryRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataSortField.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataSyncRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoCreateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoQueryRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoUpdateRequest.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexSortField.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SortDirection.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ response
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseIndexInfoDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ ErrorResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponse.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseSyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DashboardDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexInfoSummaryDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobDto.java
 ┃ ┃ ┃ ┃ ┃ ┣ entity
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegration.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ ContentType.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ Dashboard.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ Index.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLink.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexVal.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SourceType.java
 ┃ ┃ ┃ ┃ ┃ ┣ error
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CustomException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ ErrorCode.java
 ┃ ┃ ┃ ┃ ┃ ┣ exception
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ syncjobs
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DuplicateIndexException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ FailedCallOpenApiException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundIndeValException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundIndexException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ NotFoundItemException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncDataJobsServiceExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncFailedException.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobErrorCode.java
 ┃ ┃ ┃ ┃ ┃ ┃ GlobalExceptionHandler.java
 ┃ ┃ ┃ ┃ ┃ ┃ NotFoundException.java
 ┃ ┃ ┃ ┃ ┃ ┣ mapper
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ CursorPageResponseMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDateLinkMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValMapper.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValMapperHelper.java
 ┃ ┃ ┃ ┃ ┃ ┣ repository
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationQuerydslRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationRepositoryImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ DashboardRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepositoryImpl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexDataLinkRepositoryQuerydsl.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ service
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ util
 ┃ ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobUtils.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoIntegrationService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ AutoSyncConfigService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ IndexValService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncDataJobsService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncInfoJobsService.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ SyncJobsSearchService.java
 ┃ ┃ ┃ ┃ ┃ ┣ FindexTeam6Application.java
 ┃ ┣ resources
 ┃ ┃ ┣ application.yml
 ┃ ┃ ┣ schema.sql
 ┃ ┃ ┗ static
 ┃ ┃ ┃ ┣ css
 ┃ ┃ ┃ ┃ ┗ style.css
 ┃ ┃ ┃ ┣ js
 ┃ ┃ ┃ ┃ ┗ script.js
 ┣ test
 ┃ ┣ java
 ┃ ┃ ┣ com
 ┃ ┃ ┃ ┣ sprint
 ┃ ┃ ┃ ┃ ┣ findex_team6
 ┃ ┃ ┃ ┃ ┃ ┗ FindexTeam6ApplicationTests.java
 ┣ .gitignore
 ┗ README.md
```

------

## 🌐 구현 홈페이지

https://findex.realits.me/

------

## 📄 프로젝트 회고록

(제작한 발표자료 링크 혹은 첨부파일 첨부)
