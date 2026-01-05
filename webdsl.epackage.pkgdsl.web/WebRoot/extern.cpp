extern uint8_t volumeORpressureMode ;
extern uint8_t Running_Mode ;
extern osThreadId PCVmodeHandle ;
extern osThreadId AC_VCVmodeHandle ;
extern osThreadId AC_PCVmodeHandle ;
extern osThreadId SIMV_SubSetHandle ;
extern osThreadId VCVmodeHandle ;
extern osThreadId CPAPmodeHandle ;
void New_Mode_Shift( ) 
{
switch (Running_Mode) 
{
case 1:
	volumeORpressureMode	= 	0;
	Update_Internal_Parameters ( );
	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (VCVmodeHandle );
	break	 	 ;
	
case 2:
	volumeORpressureMode	= 	1;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (PCVmodeHandle );
	break	 	 ;
	
case 3:
	volumeORpressureMode	= 	0;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (AC_VCVmodeHandle );
	break	 	 ;
	
case 4:
	volumeORpressureMode	= 	1;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (AC_PCVmodeHandle );
	break	 	 ;
	
case 5:
	volumeORpressureMode	= 	0;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (SIMVmodeHandle );
	osThreadResume (SIMV_SubSetHandle );
	break	 	 ;
	
case 6:
	volumeORpressureMode	= 	0;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (CPAPmodeHandle );
  /* 7. CPAP MODE SUSPENDED */

	osThreadResume (SIMV_PSVmodeHandle );
	break	 	 ;
	
case 7:
	volumeORpressureMode	= 	1;
	Update_Internal_Parameters ( );
	osThreadSuspend (VCVmodeHandle );
  /* 1. VCV MODE SUSPENDED */

	osThreadSuspend (PCVmodeHandle );
  /* 2. PCV MODE SUSPENDED */

	osThreadSuspend (AC_VCVmodeHandle );
  /* 3. AC-VCV MODE SUSPENDED */

	osThreadSuspend (AC_PCVmodeHandle );
  /* 4. AC-PCV MODE SUSPENDED */

	osThreadSuspend (SIMV_SubSetHandle );
	osThreadSuspend (SIMVmodeHandle );
  /* 5. SIMV MODE SUSPENDED */

	osThreadSuspend (SIMV_PSVmodeHandle );
  /* 6. SIMV-PSV MODE SUSPENDED */

	osThreadResume (CPAPmodeHandle );
	break	 	 ;
	
default :
	{	break; }
}



}

