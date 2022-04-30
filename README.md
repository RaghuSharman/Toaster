# Toaster
Simple Toast Library

->  Step 1. Add the JitPack repository to your build file,
            Add it in your project level build.gradle at the end of repositories:

              allprojects {
                repositories {
                  ...
                  maven { url 'https://jitpack.io' }
                }
              }
	      
	      
    For Android Studio Version Bumblebee | 2021.1.1 and higher
    Add it in settings.gradle:
	      
	      dependencyResolutionManagement {
    		...
    		repositories {
			...
        		maven { url 'https://jitpack.io' }
    			  }
		  }
              
-> Step 2. Add the dependency,          
           Add it in your app level build.gradle at the end of repositories:
           
           dependencies {
	        implementation 'com.github.RaghuSharman:Toaster:Tag'
	        }
