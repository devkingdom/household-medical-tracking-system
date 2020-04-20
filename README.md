# Household Medical Tracking System

## Overview
Family's get medical coverage from their employers and throughout the year they may go to the doctor, have a prescription filed or an emergency.   Health insurance covers some but the family is still responsible for paying for part of these.   Often times, the medical bills come much later then the original visit because of the insurance company payment and the turn around time of the billing department.  Also the amount due is no often known ahead of time.  Finally at the end of the year, medical expenses are usually included in the family tax filings.   

What this all means, is that a method is needed to manage this information so it can be easily tracked, searched and managed.  The system supports a method for loading in information about a patient (family members), the service perform (doctor visit), the bill details and other associated information.

## Data
The system holds different types of data.  Below is key information that must be stored.

| Type | Description |
| ----------- | ----------- |
| Patient | The person in the family who receives treatment, has a prescription, or any other item. |
| Business | This could be the doctors office, drug store, or any other service provider. |
| Insurance | Insurance details. |
| Address | Used by Patient, Business and Insurance for their mailing and locations. |
| Contact Information | Used to hold contact (phone) information. |
| Service | A service that is performed by a business for a patient. |
| Pharmaceuticals | Represents a prescription or medication details. |
| Medical Codes | Most medical services are coded and have general meanings. |

## Database ERD

![ERD](/database/erd.png)

## Git Overview

Once you have access to the project you'll need basic commands to interact and get the content.  The below is a set of commands to get you started.   Search Gooogle as there are a ton of resources to help learn git.

|Concept|Command|Example|Description|
|Clone|git clone <repo_url>|git clone git@github.com:devkingdom/household-medical-tracking-system.git| Used to get a copy of the repository to work on it locally.  This is usually the first step in getting started.|
|Status|git status|git status|See what you have that is not saved, new, or removed from the respoitory.   Useful before adding content.|
|Stage Files|git add <file>|git add README.md|Used to add files to be committed to the (saved) repository.  You can use the --all to add all files at once.|
|Save Changes|git commit -m <comment>|git commit -m "Update readme with helpful commands."|Used to commit the items stages by the git add.  The commit will save all files marked to be added and store them with the given comment.  It is a good practice to always have a details comment so others know what was done.|
|Push|git pull|git pull|Use to get all the changes from the remote repository and merge them locally into your repository.|
|Pull|git push|git push|Sens all the changes in your repository up to the remote repository.|
|Switch Branch|git checkout <branch>|git checkout master|A method to switch from the current branch to a different branch.|
|See Local Branches|git branch|git branch|Used to see what branches are on your local repository.|
|See Remote Branches|git branch -r|git branch -r|Used to see what branches are on the remote server.|

## Git Pod

### Status
[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/devkingdom/household-medical-tracking-system) 

This was setup to leverage GitPod for the development environment.  Once granted access you'll need to start a workspace up that you can use to work and develop in.  To do this you'll take the gitpod base address and add the # Github repository URL.

gitpod.io/#https://github.com/devkingdom/household-medical-tracking-system

After doing this you should have a gitpod workspace for the project.  You'll now have this for your development.  

*Note:* This only needs to be done once.

## Notes


