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

- 지수 정보를 저장합니다.
	!(https://github.com/user-attachments/assets/1370ea38-0f76-4009-94d4-4d1cb564b38d)

- 지수 정보를 수정합니다.
	!(https://github.com/user-attachments/assets/d8286641-7bf8-4ae7-991f-73ded6bd2927)

- 지수 정보를 삭제합니다.
	!(https://github.com/user-attachments/assets/d09bd002-786a-497e-88fd-aa7aaf4ab55c)



### 이원길
- 지수 정보 연동
  - ![지수정보연동](https://github.com/user-attachments/assets/8812b621-bd4b-4d9a-adcb-ad2db7a3ba9d)
  - 공공데이터포털의 Open API를 이용해 주가 지수 정보를 가져옵니다.

- 지수 데이터 연동
  - ![지수데이터연동](https://github.com/user-attachments/assets/69afc93e-a246-43b5-8c4e-287bab6e1fc5)
  - 선택한 지수의 시가, 고가, 저가 같은 데이터를 Open API를 통해 가져옵니다.

- 연동 목록 조회
  - ![목록조회1](https://github.com/user-attachments/assets/c17fc55e-240b-47f7-8095-afc59e1184e8)
  - ![목록조회2](https://github.com/user-attachments/assets/bc29bbf2-a53c-4e04-9edc-3b194006e708)
  - ![목록조회3](https://github.com/user-attachments/assets/138cea04-a00f-4a50-bcbd-2108c70a463b)
  - 지수 정보와 데이터를 연동한 기록을 조회할 수 있습니다.
  - 커서 페이지네이션을 지원합니다.
 
- 자동 연동 설정
  - ![자동연동설정수정](https://github.com/user-attachments/assets/6783b162-1a04-4eb8-91c9-67dd19ec7768)
  - 지수 데이터를 자정 12시에 자동으로 연동할 수 있게 설정할 수 있습니다.
 
- 자동 연동 목록 조회
  - ![자동 연동목록조회](https://github.com/user-attachments/assets/8c87ec94-dd72-4e5c-98f2-b7c7f691ec52)
  - 자동으로 연동할 지수 목록을 조회할 수 있습니다.
  - 커서 페이지네이션을 지원합니다.



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
