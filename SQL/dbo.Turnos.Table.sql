USE [CentroMedico]
GO
/****** Object:  Table [dbo].[Turnos]    Script Date: 22/06/2020 23:11:05 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Turnos](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[fecha] [smalldatetime] NOT NULL,
	[especialidad] [varchar](45) NOT NULL,
	[idUsrMed] [int] NOT NULL,
	[idUsrPac] [int] NULL,
	[estado] [varchar](25) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Turnos]  WITH CHECK ADD  CONSTRAINT [FK_TurnoIdUsrMed_Medicos] FOREIGN KEY([idUsrMed], [especialidad])
REFERENCES [dbo].[Medicos] ([idUsr], [especialidad])
GO
ALTER TABLE [dbo].[Turnos] CHECK CONSTRAINT [FK_TurnoIdUsrMed_Medicos]
GO
ALTER TABLE [dbo].[Turnos]  WITH CHECK ADD  CONSTRAINT [FK_TurnoIdUsrPac_Pacientes] FOREIGN KEY([idUsrPac])
REFERENCES [dbo].[Pacientes] ([idUsr])
GO
ALTER TABLE [dbo].[Turnos] CHECK CONSTRAINT [FK_TurnoIdUsrPac_Pacientes]
GO
