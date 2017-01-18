Build and Release
=================

There are several things necessary in order for a developer to publish a new release of `Selenium-PageModel`. Assuming you have read Sonatype's in-depth instructions on how to publish as well as explicit permission granted to you by the existing developers, the steps are quite simple!

## Release Process

### Step 1 : Development

In addition to making whatever appropriate changes to the project, please document the changes in the `RELEASE_NOTES.md`

### Step 2 : Continually push SNAPSHOT builds

`SNAPSHOT` builds can be pushed simply by executing:

	mvn clean deploy
	
### Step 3 : Prepare for Release

We use an Apache Release maven release plugin to prepare a release and uprev to the expected next version:

	mvn release:clean release:prepare
	
### Step 4 : Publish

We actually push the release for public consumption using:

	mvn release:perform